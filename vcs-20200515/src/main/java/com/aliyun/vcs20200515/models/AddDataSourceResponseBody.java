// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddDataSourceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public AddDataSourceResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static AddDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceResponseBody self = new AddDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDataSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddDataSourceResponseBody setData(AddDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDataSourceResponseBodyData getData() {
        return this.data;
    }

    public AddDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class AddDataSourceResponseBodyData extends TeaModel {
        @NameInMap("KafkaTopic")
        public String kafkaTopic;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("OssPath")
        public String ossPath;

        public static AddDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDataSourceResponseBodyData self = new AddDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDataSourceResponseBodyData setKafkaTopic(String kafkaTopic) {
            this.kafkaTopic = kafkaTopic;
            return this;
        }
        public String getKafkaTopic() {
            return this.kafkaTopic;
        }

        public AddDataSourceResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
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
