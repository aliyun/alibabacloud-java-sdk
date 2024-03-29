// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddDataSourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddDataSourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceResponseBody self = new AddDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddDataSourceResponseBody setData(AddDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDataSourceResponseBodyData getData() {
        return this.data;
    }

    public AddDataSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddDataSourceResponseBodyData extends TeaModel {
        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("KafkaTopic")
        public String kafkaTopic;

        @NameInMap("OssPath")
        public String ossPath;

        public static AddDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDataSourceResponseBodyData self = new AddDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDataSourceResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public AddDataSourceResponseBodyData setKafkaTopic(String kafkaTopic) {
            this.kafkaTopic = kafkaTopic;
            return this;
        }
        public String getKafkaTopic() {
            return this.kafkaTopic;
        }

        public AddDataSourceResponseBodyData setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

    }

}
