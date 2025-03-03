// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class MoveResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C00B89D3-3247-11DE-95D8-A7C01FB0AB4F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Responses")
    public java.util.List<MoveResourcesResponseBodyResponses> responses;

    public static MoveResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveResourcesResponseBody self = new MoveResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveResourcesResponseBody setResponses(java.util.List<MoveResourcesResponseBodyResponses> responses) {
        this.responses = responses;
        return this;
    }
    public java.util.List<MoveResourcesResponseBodyResponses> getResponses() {
        return this.responses;
    }

    public static class MoveResourcesResponseBodyResponses extends TeaModel {
        /**
         * <p>The error code returned.</p>
         * <blockquote>
         * <p> This parameter is returned if the resource failed to be moved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NoPermission</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned.</p>
         * <blockquote>
         * <p> This parameter is returned if the resource failed to be moved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>No permissions</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C00B89D3-3247-11DE-95D8-A7C01FB0AB4F</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1sig0mjktx5ewx1****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <p>The status of the move task. Valid values:</p>
         * <ul>
         * <li>SUCCESS</li>
         * <li>FAIL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAIL</p>
         */
        @NameInMap("Status")
        public String status;

        public static MoveResourcesResponseBodyResponses build(java.util.Map<String, ?> map) throws Exception {
            MoveResourcesResponseBodyResponses self = new MoveResourcesResponseBodyResponses();
            return TeaModel.build(map, self);
        }

        public MoveResourcesResponseBodyResponses setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public MoveResourcesResponseBodyResponses setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public MoveResourcesResponseBodyResponses setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public MoveResourcesResponseBodyResponses setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public MoveResourcesResponseBodyResponses setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public MoveResourcesResponseBodyResponses setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public MoveResourcesResponseBodyResponses setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public MoveResourcesResponseBodyResponses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
