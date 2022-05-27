// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateDatasetResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateDatasetResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetResponseBody self = new UpdateDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetResponseBody setData(UpdateDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDatasetResponseBodyData getData() {
        return this.data;
    }

    public UpdateDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateDatasetResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static UpdateDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetResponseBodyData self = new UpdateDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateDatasetResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateDatasetResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateDatasetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
