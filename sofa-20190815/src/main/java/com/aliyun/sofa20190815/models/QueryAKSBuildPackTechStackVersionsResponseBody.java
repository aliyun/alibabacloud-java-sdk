// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAKSBuildPackTechStackVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Total")
    public Long total;

    @NameInMap("List")
    public java.util.List<QueryAKSBuildPackTechStackVersionsResponseBodyList> list;

    public static QueryAKSBuildPackTechStackVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAKSBuildPackTechStackVersionsResponseBody self = new QueryAKSBuildPackTechStackVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAKSBuildPackTechStackVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAKSBuildPackTechStackVersionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAKSBuildPackTechStackVersionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryAKSBuildPackTechStackVersionsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryAKSBuildPackTechStackVersionsResponseBody setList(java.util.List<QueryAKSBuildPackTechStackVersionsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryAKSBuildPackTechStackVersionsResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryAKSBuildPackTechStackVersionsResponseBodyList extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ExternalDestImage")
        public String externalDestImage;

        @NameInMap("ExternalRegistryPassword")
        public String externalRegistryPassword;

        @NameInMap("ExternalRegistryUser")
        public String externalRegistryUser;

        @NameInMap("FromImage")
        public String fromImage;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PackageDir")
        public String packageDir;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegistryPassword")
        public String registryPassword;

        @NameInMap("RegistryUser")
        public String registryUser;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("TechStack")
        public String techStack;

        @NameInMap("TechStackId")
        public String techStackId;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Version")
        public String version;

        public static QueryAKSBuildPackTechStackVersionsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryAKSBuildPackTechStackVersionsResponseBodyList self = new QueryAKSBuildPackTechStackVersionsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setExternalDestImage(String externalDestImage) {
            this.externalDestImage = externalDestImage;
            return this;
        }
        public String getExternalDestImage() {
            return this.externalDestImage;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setExternalRegistryPassword(String externalRegistryPassword) {
            this.externalRegistryPassword = externalRegistryPassword;
            return this;
        }
        public String getExternalRegistryPassword() {
            return this.externalRegistryPassword;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setExternalRegistryUser(String externalRegistryUser) {
            this.externalRegistryUser = externalRegistryUser;
            return this;
        }
        public String getExternalRegistryUser() {
            return this.externalRegistryUser;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setFromImage(String fromImage) {
            this.fromImage = fromImage;
            return this;
        }
        public String getFromImage() {
            return this.fromImage;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setPackageDir(String packageDir) {
            this.packageDir = packageDir;
            return this;
        }
        public String getPackageDir() {
            return this.packageDir;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setRegistryPassword(String registryPassword) {
            this.registryPassword = registryPassword;
            return this;
        }
        public String getRegistryPassword() {
            return this.registryPassword;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setRegistryUser(String registryUser) {
            this.registryUser = registryUser;
            return this;
        }
        public String getRegistryUser() {
            return this.registryUser;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setTechStack(String techStack) {
            this.techStack = techStack;
            return this;
        }
        public String getTechStack() {
            return this.techStack;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setTechStackId(String techStackId) {
            this.techStackId = techStackId;
            return this;
        }
        public String getTechStackId() {
            return this.techStackId;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryAKSBuildPackTechStackVersionsResponseBodyList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
