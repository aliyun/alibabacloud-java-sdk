// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210916_103600223.models;

import com.aliyun.tea.*;

public class AssetPublishTestOpenApiRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("teacher")
    public AssetPublishTestOpenApiRequestTeacher teacher;

    public static AssetPublishTestOpenApiRequest build(java.util.Map<String, ?> map) throws Exception {
        AssetPublishTestOpenApiRequest self = new AssetPublishTestOpenApiRequest();
        return TeaModel.build(map, self);
    }

    public AssetPublishTestOpenApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AssetPublishTestOpenApiRequest setTeacher(AssetPublishTestOpenApiRequestTeacher teacher) {
        this.teacher = teacher;
        return this;
    }
    public AssetPublishTestOpenApiRequestTeacher getTeacher() {
        return this.teacher;
    }

    public static class AssetPublishTestOpenApiRequestTeacher extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("age")
        public Integer age;

        public static AssetPublishTestOpenApiRequestTeacher build(java.util.Map<String, ?> map) throws Exception {
            AssetPublishTestOpenApiRequestTeacher self = new AssetPublishTestOpenApiRequestTeacher();
            return TeaModel.build(map, self);
        }

        public AssetPublishTestOpenApiRequestTeacher setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AssetPublishTestOpenApiRequestTeacher setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

    }

}
