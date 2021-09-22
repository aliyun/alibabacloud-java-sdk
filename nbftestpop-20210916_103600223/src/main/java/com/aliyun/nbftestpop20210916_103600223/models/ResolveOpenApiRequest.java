// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210916_103600223.models;

import com.aliyun.tea.*;

public class ResolveOpenApiRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("age")
    public Integer age;

    @NameInMap("teacher")
    public ResolveOpenApiRequestTeacher teacher;

    @NameInMap("friends")
    public java.util.List<java.util.Map<String, ?>> friends;

    public static ResolveOpenApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ResolveOpenApiRequest self = new ResolveOpenApiRequest();
        return TeaModel.build(map, self);
    }

    public ResolveOpenApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResolveOpenApiRequest setAge(Integer age) {
        this.age = age;
        return this;
    }
    public Integer getAge() {
        return this.age;
    }

    public ResolveOpenApiRequest setTeacher(ResolveOpenApiRequestTeacher teacher) {
        this.teacher = teacher;
        return this;
    }
    public ResolveOpenApiRequestTeacher getTeacher() {
        return this.teacher;
    }

    public ResolveOpenApiRequest setFriends(java.util.List<java.util.Map<String, ?>> friends) {
        this.friends = friends;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getFriends() {
        return this.friends;
    }

    public static class ResolveOpenApiRequestTeacher extends TeaModel {
        @NameInMap("teacherAge")
        public Integer teacherAge;

        @NameInMap("teacherName")
        public String teacherName;

        public static ResolveOpenApiRequestTeacher build(java.util.Map<String, ?> map) throws Exception {
            ResolveOpenApiRequestTeacher self = new ResolveOpenApiRequestTeacher();
            return TeaModel.build(map, self);
        }

        public ResolveOpenApiRequestTeacher setTeacherAge(Integer teacherAge) {
            this.teacherAge = teacherAge;
            return this;
        }
        public Integer getTeacherAge() {
            return this.teacherAge;
        }

        public ResolveOpenApiRequestTeacher setTeacherName(String teacherName) {
            this.teacherName = teacherName;
            return this;
        }
        public String getTeacherName() {
            return this.teacherName;
        }

    }

}
