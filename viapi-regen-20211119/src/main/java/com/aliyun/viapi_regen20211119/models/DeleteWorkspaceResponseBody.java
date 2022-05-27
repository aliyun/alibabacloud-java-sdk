// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteWorkspaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceResponseBody self = new DeleteWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceResponseBody setData(DeleteWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public DeleteWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteWorkspaceResponseBodyData extends TeaModel {
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

        public static DeleteWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteWorkspaceResponseBodyData self = new DeleteWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteWorkspaceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteWorkspaceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteWorkspaceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteWorkspaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteWorkspaceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
