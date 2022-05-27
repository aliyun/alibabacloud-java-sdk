// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteDatasetResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteDatasetResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetResponseBody self = new DeleteDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetResponseBody setData(DeleteDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDatasetResponseBodyData getData() {
        return this.data;
    }

    public DeleteDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDatasetResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static DeleteDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDatasetResponseBodyData self = new DeleteDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDatasetResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteDatasetResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteDatasetResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteDatasetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
