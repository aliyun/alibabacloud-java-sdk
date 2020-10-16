// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddDataSourceResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public AddDataSourceResponseData data;

    public static AddDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceResponse self = new AddDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public AddDataSourceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddDataSourceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddDataSourceResponse setData(AddDataSourceResponseData data) {
        this.data = data;
        return this;
    }
    public AddDataSourceResponseData getData() {
        return this.data;
    }

    public static class AddDataSourceResponseData extends TeaModel {
        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("KafkaTopic")
        @Validation(required = true)
        public String kafkaTopic;

        @NameInMap("OssPath")
        @Validation(required = true)
        public String ossPath;

        public static AddDataSourceResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddDataSourceResponseData self = new AddDataSourceResponseData();
            return TeaModel.build(map, self);
        }

        public AddDataSourceResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public AddDataSourceResponseData setKafkaTopic(String kafkaTopic) {
            this.kafkaTopic = kafkaTopic;
            return this;
        }
        public String getKafkaTopic() {
            return this.kafkaTopic;
        }

        public AddDataSourceResponseData setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

    }

}
