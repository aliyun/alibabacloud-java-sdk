// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210916_103600223.models;

import com.aliyun.tea.*;

public class AssetPublishTestOpenApiResponseBody extends TeaModel {
    @NameInMap("teacher")
    public AssetPublishTestOpenApiResponseBodyTeacher teacher;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    public static AssetPublishTestOpenApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssetPublishTestOpenApiResponseBody self = new AssetPublishTestOpenApiResponseBody();
        return TeaModel.build(map, self);
    }

    public AssetPublishTestOpenApiResponseBody setTeacher(AssetPublishTestOpenApiResponseBodyTeacher teacher) {
        this.teacher = teacher;
        return this;
    }
    public AssetPublishTestOpenApiResponseBodyTeacher getTeacher() {
        return this.teacher;
    }

    public AssetPublishTestOpenApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AssetPublishTestOpenApiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AssetPublishTestOpenApiResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public static class AssetPublishTestOpenApiResponseBodyTeacher extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("age")
        public String age;

        public static AssetPublishTestOpenApiResponseBodyTeacher build(java.util.Map<String, ?> map) throws Exception {
            AssetPublishTestOpenApiResponseBodyTeacher self = new AssetPublishTestOpenApiResponseBodyTeacher();
            return TeaModel.build(map, self);
        }

        public AssetPublishTestOpenApiResponseBodyTeacher setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AssetPublishTestOpenApiResponseBodyTeacher setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

    }

}
