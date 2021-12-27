// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class DescribeAppResponseBody extends TeaModel {
    @NameInMap("AppModel")
    public DescribeAppResponseBodyAppModel appModel;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResponseBody self = new DescribeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppResponseBody setAppModel(DescribeAppResponseBodyAppModel appModel) {
        this.appModel = appModel;
        return this;
    }
    public DescribeAppResponseBodyAppModel getAppModel() {
        return this.appModel;
    }

    public DescribeAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeAppResponseBodyAppModel extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Config")
        public String config;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Uid")
        public Long uid;

        public static DescribeAppResponseBodyAppModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyAppModel self = new DescribeAppResponseBodyAppModel();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyAppModel setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppResponseBodyAppModel setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeAppResponseBodyAppModel setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeAppResponseBodyAppModel setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

}
