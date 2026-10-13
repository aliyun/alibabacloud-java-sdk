// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class SubmitPenetrationTestResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public SubmitPenetrationTestResponseBodyData data;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67BD8435-6624-5484-A75D-170231B51615</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The call status. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitPenetrationTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitPenetrationTestResponseBody self = new SubmitPenetrationTestResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitPenetrationTestResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitPenetrationTestResponseBody setData(SubmitPenetrationTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitPenetrationTestResponseBodyData getData() {
        return this.data;
    }

    public SubmitPenetrationTestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitPenetrationTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitPenetrationTestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitPenetrationTestResponseBodyDataList extends TeaModel {
        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>EIP</strong>: The public IP address of a virtual private cloud (VPC).</li>
         * <li><strong>SLB</strong>: load balancing</li>
         * <li><strong>ECS</strong>: The public IP address of an Elastic Compute Service (ECS) instance in the classic network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.xxx.58</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static SubmitPenetrationTestResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            SubmitPenetrationTestResponseBodyDataList self = new SubmitPenetrationTestResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public SubmitPenetrationTestResponseBodyDataList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public SubmitPenetrationTestResponseBodyDataList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class SubmitPenetrationTestResponseBodyData extends TeaModel {
        /**
         * <p>The returned data.</p>
         */
        @NameInMap("List")
        public java.util.List<SubmitPenetrationTestResponseBodyDataList> list;

        public static SubmitPenetrationTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitPenetrationTestResponseBodyData self = new SubmitPenetrationTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitPenetrationTestResponseBodyData setList(java.util.List<SubmitPenetrationTestResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<SubmitPenetrationTestResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
