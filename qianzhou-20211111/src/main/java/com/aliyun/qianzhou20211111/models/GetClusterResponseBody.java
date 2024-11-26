// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    @NameInMap("data")
    public GetClusterResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static GetClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterResponseBody self = new GetClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterResponseBody setData(GetClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetClusterResponseBodyData getData() {
        return this.data;
    }

    public GetClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterResponseBodyData extends TeaModel {
        @NameInMap("clusterID")
        public String clusterID;

        @NameInMap("clusterType")
        public String clusterType;

        @NameInMap("currentVersion")
        public String currentVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("profile")
        public String profile;

        @NameInMap("regionID")
        public String regionID;

        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("spec")
        public String spec;

        @NameInMap("state")
        public String state;

        @NameInMap("userID")
        public String userID;

        public static GetClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyData self = new GetClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyData setClusterID(String clusterID) {
            this.clusterID = clusterID;
            return this;
        }
        public String getClusterID() {
            return this.clusterID;
        }

        public GetClusterResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public GetClusterResponseBodyData setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public GetClusterResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterResponseBodyData setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetClusterResponseBodyData setRegionID(String regionID) {
            this.regionID = regionID;
            return this;
        }
        public String getRegionID() {
            return this.regionID;
        }

        public GetClusterResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetClusterResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetClusterResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetClusterResponseBodyData setUserID(String userID) {
            this.userID = userID;
            return this;
        }
        public String getUserID() {
            return this.userID;
        }

    }

}
