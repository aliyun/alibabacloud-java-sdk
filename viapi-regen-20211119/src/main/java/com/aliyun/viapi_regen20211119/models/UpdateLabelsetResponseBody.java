// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateLabelsetResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateLabelsetResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLabelsetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLabelsetResponseBody self = new UpdateLabelsetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLabelsetResponseBody setData(UpdateLabelsetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLabelsetResponseBodyData getData() {
        return this.data;
    }

    public UpdateLabelsetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateLabelsetResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public Long description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public Long name;

        public static UpdateLabelsetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLabelsetResponseBodyData self = new UpdateLabelsetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLabelsetResponseBodyData setDescription(Long description) {
            this.description = description;
            return this;
        }
        public Long getDescription() {
            return this.description;
        }

        public UpdateLabelsetResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateLabelsetResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLabelsetResponseBodyData setName(Long name) {
            this.name = name;
            return this;
        }
        public Long getName() {
            return this.name;
        }

    }

}
