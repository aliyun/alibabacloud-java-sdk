// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateDatasetResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDatasetResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetResponseBody self = new CreateDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetResponseBody setData(CreateDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDatasetResponseBodyData getData() {
        return this.data;
    }

    public CreateDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDatasetResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static CreateDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetResponseBodyData self = new CreateDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDatasetResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDatasetResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateDatasetResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateDatasetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
