package vmsa.resource.service.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import vmsa.resource.service.impl.UserDetailsImpl;

import java.util.List;

@Mapper
@Repository("UserMapper")
public interface UserMapper {
    List<UserDetailsImpl> selectList();

    UserDetails findByUsername(String username);
}
