// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteLabelsetResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteLabelsetResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLabelsetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelsetResponseBody self = new DeleteLabelsetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLabelsetResponseBody setData(DeleteLabelsetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteLabelsetResponseBodyData getData() {
        return this.data;
    }

    public DeleteLabelsetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLabelsetResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LabelType")
        public String labelType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static DeleteLabelsetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteLabelsetResponseBodyData self = new DeleteLabelsetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteLabelsetResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteLabelsetResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteLabelsetResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteLabelsetResponseBodyData setLabelType(String labelType) {
            this.labelType = labelType;
            return this;
        }
        public String getLabelType() {
            return this.labelType;
        }

        public DeleteLabelsetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteLabelsetResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
