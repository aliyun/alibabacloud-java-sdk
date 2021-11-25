// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDataSourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DeleteDataSourcesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourcesResponseBody self = new DeleteDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDataSourcesResponseBody setData(java.util.List<DeleteDataSourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DeleteDataSourcesResponseBodyData> getData() {
        return this.data;
    }

    public DeleteDataSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDataSourcesResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("Message")
        public String message;

        public static DeleteDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataSourcesResponseBodyData self = new DeleteDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDataSourcesResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteDataSourcesResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public DeleteDataSourcesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
