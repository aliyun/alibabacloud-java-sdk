// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateWorkspaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResponseBody self = new UpdateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResponseBody setData(UpdateWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public UpdateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateWorkspaceResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static UpdateWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceResponseBodyData self = new UpdateWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateWorkspaceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateWorkspaceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateWorkspaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkspaceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
