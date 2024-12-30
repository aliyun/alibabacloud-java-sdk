// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetDataSourceConnectionInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7AAB95D-*****-****-*4FC0C976</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetDataSourceConnectionInfoResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataSourceConnectionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceConnectionInfoResponseBody self = new GetDataSourceConnectionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceConnectionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSourceConnectionInfoResponseBody setResult(GetDataSourceConnectionInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDataSourceConnectionInfoResponseBodyResult getResult() {
        return this.result;
    }

    public GetDataSourceConnectionInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataSourceConnectionInfoResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>172.<strong>.</strong>.48</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AuthLevel")
        public String authLevel;

        /**
         * <strong>example:</strong>
         * <p>U240****0880C6095</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <strong>example:</strong>
         * <p>a201c85c-******</p>
         */
        @NameInMap("DsId")
        public String dsId;

        /**
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DsType")
        public String dsType;

        /**
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("DsVersion")
        public String dsVersion;

        /**
         * <strong>example:</strong>
         * <p>rm*********t44ju1</p>
         */
        @NameInMap("Instance")
        public String instance;

        /**
         * <strong>example:</strong>
         * <p>rm*********t44ju1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>U240****0880C6095</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NoSasl")
        public Boolean noSasl;

        /**
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("ParentDsType")
        public String parentDsType;

        /**
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>prod-ossdoc</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <strong>example:</strong>
         * <p>Analysis</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <strong>example:</strong>
         * <p>0327</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <strong>example:</strong>
         * <p>0de6<strong>2-d</strong>-4720-8836-0cc****1394c</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetDataSourceConnectionInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceConnectionInfoResponseBodyResult self = new GetDataSourceConnectionInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDataSourceConnectionInfoResponseBodyResult setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setAuthLevel(String authLevel) {
            this.authLevel = authLevel;
            return this;
        }
        public String getAuthLevel() {
            return this.authLevel;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setDsId(String dsId) {
            this.dsId = dsId;
            return this;
        }
        public String getDsId() {
            return this.dsId;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setDsVersion(String dsVersion) {
            this.dsVersion = dsVersion;
            return this;
        }
        public String getDsVersion() {
            return this.dsVersion;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setNoSasl(Boolean noSasl) {
            this.noSasl = noSasl;
            return this;
        }
        public Boolean getNoSasl() {
            return this.noSasl;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setParentDsType(String parentDsType) {
            this.parentDsType = parentDsType;
            return this;
        }
        public String getParentDsType() {
            return this.parentDsType;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetDataSourceConnectionInfoResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
