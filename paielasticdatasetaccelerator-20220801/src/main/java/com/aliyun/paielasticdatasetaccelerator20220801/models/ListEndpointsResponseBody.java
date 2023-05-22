// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ListEndpointsResponseBody extends TeaModel {
    @NameInMap("Endpoints")
    public java.util.List<ListEndpointsResponseBodyEndpoints> endpoints;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointsResponseBody self = new ListEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEndpointsResponseBody setEndpoints(java.util.List<ListEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<ListEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public ListEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEndpointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEndpointsResponseBodyEndpoints extends TeaModel {
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>所属加速实例的ID。</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Status")
        public EndpointStatus status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static ListEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointsResponseBodyEndpoints self = new ListEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public ListEndpointsResponseBodyEndpoints setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListEndpointsResponseBodyEndpoints setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListEndpointsResponseBodyEndpoints setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEndpointsResponseBodyEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEndpointsResponseBodyEndpoints setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListEndpointsResponseBodyEndpoints setStatus(EndpointStatus status) {
            this.status = status;
            return this;
        }
        public EndpointStatus getStatus() {
            return this.status;
        }

        public ListEndpointsResponseBodyEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEndpointsResponseBodyEndpoints setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListEndpointsResponseBodyEndpoints setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListEndpointsResponseBodyEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListEndpointsResponseBodyEndpoints setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
