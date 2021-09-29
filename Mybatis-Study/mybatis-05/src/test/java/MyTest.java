import com.wang.dao.StudentMapper;
import com.wang.dao.TeacherMapper;
import com.wang.pojo.Student;
import com.wang.pojo.Teacher;
import com.wang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);


        sqlSession.close();
    }


}
