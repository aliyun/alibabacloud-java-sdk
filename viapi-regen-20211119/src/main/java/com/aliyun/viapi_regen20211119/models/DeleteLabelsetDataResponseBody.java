// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteLabelsetDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteLabelsetDataResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLabelsetDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelsetDataResponseBody self = new DeleteLabelsetDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLabelsetDataResponseBody setData(DeleteLabelsetDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteLabelsetDataResponseBodyData getData() {
        return this.data;
    }

    public DeleteLabelsetDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLabelsetDataResponseBodyData extends TeaModel {
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

        @NameInMap("Total")
        public Long total;

        public static DeleteLabelsetDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteLabelsetDataResponseBodyData self = new DeleteLabelsetDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteLabelsetDataResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteLabelsetDataResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteLabelsetDataResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteLabelsetDataResponseBodyData setLabelType(String labelType) {
            this.labelType = labelType;
            return this;
        }
        public String getLabelType() {
            return this.labelType;
        }

        public DeleteLabelsetDataResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteLabelsetDataResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteLabelsetDataResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
