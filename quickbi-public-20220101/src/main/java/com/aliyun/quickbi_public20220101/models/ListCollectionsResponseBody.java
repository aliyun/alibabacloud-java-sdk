// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListCollectionsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>162A632E-0A88-51CF-98F8-94FDEE82DB7D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListCollectionsResponseBodyResult> result;

    /**
     * <p>The primary key ID of the favorite record.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionsResponseBody self = new ListCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCollectionsResponseBody setResult(java.util.List<ListCollectionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCollectionsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListCollectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCollectionsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12373</p>
         */
        @NameInMap("FavoriteId")
        public Integer favoriteId;

        /**
         * <strong>example:</strong>
         * <p>fe67f61a35a94b7da1a34ba174a7****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        @NameInMap("WorksName")
        public String worksName;

        /**
         * <strong>example:</strong>
         * <p>dashboardOfflineQuery</p>
         */
        @NameInMap("WorksType")
        public String worksType;

        /**
         * <strong>example:</strong>
         * <p>9337d121-a78f-4c1b-a8bc-f81de117****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListCollectionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionsResponseBodyResult self = new ListCollectionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCollectionsResponseBodyResult setFavoriteId(Integer favoriteId) {
            this.favoriteId = favoriteId;
            return this;
        }
        public Integer getFavoriteId() {
            return this.favoriteId;
        }

        public ListCollectionsResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListCollectionsResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public ListCollectionsResponseBodyResult setWorksName(String worksName) {
            this.worksName = worksName;
            return this;
        }
        public String getWorksName() {
            return this.worksName;
        }

        public ListCollectionsResponseBodyResult setWorksType(String worksType) {
            this.worksType = worksType;
            return this;
        }
        public String getWorksType() {
            return this.worksType;
        }

        public ListCollectionsResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListCollectionsResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
