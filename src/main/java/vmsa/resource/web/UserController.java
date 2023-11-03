package vmsa.resource.web;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
//import vmsa.resource.service.UserService;
import vmsa.resource.service.impl.UserDetailsImpl;
import vmsa.resource.service.impl.UserDetailsServiceImpl;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserDetailsServiceImpl userDetailsServiceImpl;

    @ApiOperation(value = "사용자", notes = "사용자 등록한다.")
    @PostMapping(value = "/account/users")
    public String create(UserDetailsImpl user) {

        logger.info("#### create");

        return "success";
    }
//
//    @ApiOperation(value = "사용자", notes = "사용자 삭제한다.")
//    @DeleteMapping(value = "/user/{user_id}")
//    public String delete(User user) {
//
//        userService.delete(user);
//
//        return "redirect:/";
//    }

    @ApiOperation(value = "사용자", notes = "사용자 정보 조회한다.")
    @GetMapping(value = "/account/users")
    public List<UserDetailsImpl> findAllUser() {

        logger.info("#### findAllUser");

        return userDetailsServiceImpl.findAll();
    }
}
