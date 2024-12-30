// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateHighReliablePhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>If the request fails the dry run, the following error codes and error messages may be returned:</p>
     * <ul>
     * <li>pconn.high.reliable.dryrun.error.disable.outbound.data.transfer.billing. Billing for outbound data transfer is not enabled.</li>
     * <li>pconn.high.reliable.dryrun.error.incompatable.device.capacity. No device in the access point supports advanced features.</li>
     * <li>pconn.high.reliable.dryrun.error.quota.exceeded. The quota is insufficient.</li>
     * <li>pconn.high.reliable.dryrun.error.not.enough.resource. The access point resources are insufficient.</li>
     * </ul>
     */
    @NameInMap("ErrorInfoList")
    public CreateHighReliablePhysicalConnectionResponseBodyErrorInfoList errorInfoList;

    /**
     * <p>The Express Connect circuits.</p>
     */
    @NameInMap("PhysicalConnectionList")
    public CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionList physicalConnectionList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHighReliablePhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHighReliablePhysicalConnectionResponseBody self = new CreateHighReliablePhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHighReliablePhysicalConnectionResponseBody setErrorInfoList(CreateHighReliablePhysicalConnectionResponseBodyErrorInfoList errorInfoList) {
        this.errorInfoList = errorInfoList;
        return this;
    }
    public CreateHighReliablePhysicalConnectionResponseBodyErrorInfoList getErrorInfoList() {
        return this.errorInfoList;
    }

    public CreateHighReliablePhysicalConnectionResponseBody setPhysicalConnectionList(CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionList physicalConnectionList) {
        this.physicalConnectionList = physicalConnectionList;
        return this;
    }
    public CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionList getPhysicalConnectionList() {
        return this.physicalConnectionList;
    }

    public CreateHighReliablePhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateHighReliablePhysicalConnectionResponseBodyErrorInfoListErrorInfoList extends TeaModel {
        /**
         * <p>Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>pconn.high.reliable.dryrun.error.disable.outbound.data.transfer.billing</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>pconn.high.reliable.dryrun.error.disable.outbound.data.transfer.billing</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-j5e5qqo616p81ncspbll1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateHighReliablePhysicalConnectionResponseBodyErrorInfoListErrorInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateHighReliablePhysicalConnectionResponseBodyErrorInfoListErrorInfoList self = new CreateHighReliablePhysicalConnectionResponseBodyErrorInfoListErrorInfoList();
            return TeaModel.build(map, self);
        }

        public CreateHighReliablePhysicalConnectionResponseBodyErrorInfoListErrorInfoList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateHighReliablePhysicalConnectionResponseBodyErrorInfoListErrorInfoList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateHighReliablePhysicalConnectionResponseBodyErrorInfoListErrorInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateHighReliablePhysicalConnectionResponseBodyErrorInfoList extends TeaModel {
        @NameInMap("errorInfoList")
        public java.util.List<CreateHighReliablePhysicalConnectionResponseBodyErrorInfoListErrorInfoList> errorInfoList;

        public static CreateHighReliablePhysicalConnectionResponseBodyErrorInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateHighReliablePhysicalConnectionResponseBodyErrorInfoList self = new CreateHighReliablePhysicalConnectionResponseBodyErrorInfoList();
            return TeaModel.build(map, self);
        }

        public CreateHighReliablePhysicalConnectionResponseBodyErrorInfoList setErrorInfoList(java.util.List<CreateHighReliablePhysicalConnectionResponseBodyErrorInfoListErrorInfoList> errorInfoList) {
            this.errorInfoList = errorInfoList;
            return this;
        }
        public java.util.List<CreateHighReliablePhysicalConnectionResponseBodyErrorInfoListErrorInfoList> getErrorInfoList() {
            return this.errorInfoList;
        }

    }

    public static class CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionListPhysicalConnectionList extends TeaModel {
        /**
         * <p>The ID of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-j5e5qqo616p81ncspbll1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionListPhysicalConnectionList build(java.util.Map<String, ?> map) throws Exception {
            CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionListPhysicalConnectionList self = new CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionListPhysicalConnectionList();
            return TeaModel.build(map, self);
        }

        public CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionListPhysicalConnectionList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionListPhysicalConnectionList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

    public static class CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionList extends TeaModel {
        @NameInMap("physicalConnectionList")
        public java.util.List<CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionListPhysicalConnectionList> physicalConnectionList;

        public static CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionList build(java.util.Map<String, ?> map) throws Exception {
            CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionList self = new CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionList();
            return TeaModel.build(map, self);
        }

        public CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionList setPhysicalConnectionList(java.util.List<CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionListPhysicalConnectionList> physicalConnectionList) {
            this.physicalConnectionList = physicalConnectionList;
            return this;
        }
        public java.util.List<CreateHighReliablePhysicalConnectionResponseBodyPhysicalConnectionListPhysicalConnectionList> getPhysicalConnectionList() {
            return this.physicalConnectionList;
        }

    }

}
