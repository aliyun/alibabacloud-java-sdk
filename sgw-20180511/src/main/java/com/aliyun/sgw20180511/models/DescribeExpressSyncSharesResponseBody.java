// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeExpressSyncSharesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Shares")
    public DescribeExpressSyncSharesResponseBodyShares shares;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeExpressSyncSharesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressSyncSharesResponseBody self = new DescribeExpressSyncSharesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressSyncSharesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExpressSyncSharesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExpressSyncSharesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressSyncSharesResponseBody setShares(DescribeExpressSyncSharesResponseBodyShares shares) {
        this.shares = shares;
        return this;
    }
    public DescribeExpressSyncSharesResponseBodyShares getShares() {
        return this.shares;
    }

    public DescribeExpressSyncSharesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeExpressSyncSharesResponseBodySharesShare extends TeaModel {
        @NameInMap("ExpressSyncId")
        public String expressSyncId;

        @NameInMap("ExpressSyncState")
        public String expressSyncState;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GatewayName")
        public String gatewayName;

        @NameInMap("GatewayRegion")
        public String gatewayRegion;

        @NameInMap("MnsQueue")
        public String mnsQueue;

        @NameInMap("ShareName")
        public String shareName;

        @NameInMap("StorageBundleId")
        public String storageBundleId;

        @NameInMap("SyncProgress")
        public Integer syncProgress;

        public static DescribeExpressSyncSharesResponseBodySharesShare build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressSyncSharesResponseBodySharesShare self = new DescribeExpressSyncSharesResponseBodySharesShare();
            return TeaModel.build(map, self);
        }

        public DescribeExpressSyncSharesResponseBodySharesShare setExpressSyncId(String expressSyncId) {
            this.expressSyncId = expressSyncId;
            return this;
        }
        public String getExpressSyncId() {
            return this.expressSyncId;
        }

        public DescribeExpressSyncSharesResponseBodySharesShare setExpressSyncState(String expressSyncState) {
            this.expressSyncState = expressSyncState;
            return this;
        }
        public String getExpressSyncState() {
            return this.expressSyncState;
        }

        public DescribeExpressSyncSharesResponseBodySharesShare setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeExpressSyncSharesResponseBodySharesShare setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public DescribeExpressSyncSharesResponseBodySharesShare setGatewayRegion(String gatewayRegion) {
            this.gatewayRegion = gatewayRegion;
            return this;
        }
        public String getGatewayRegion() {
            return this.gatewayRegion;
        }

        public DescribeExpressSyncSharesResponseBodySharesShare setMnsQueue(String mnsQueue) {
            this.mnsQueue = mnsQueue;
            return this;
        }
        public String getMnsQueue() {
            return this.mnsQueue;
        }

        public DescribeExpressSyncSharesResponseBodySharesShare setShareName(String shareName) {
            this.shareName = shareName;
            return this;
        }
        public String getShareName() {
            return this.shareName;
        }

        public DescribeExpressSyncSharesResponseBodySharesShare setStorageBundleId(String storageBundleId) {
            this.storageBundleId = storageBundleId;
            return this;
        }
        public String getStorageBundleId() {
            return this.storageBundleId;
        }

        public DescribeExpressSyncSharesResponseBodySharesShare setSyncProgress(Integer syncProgress) {
            this.syncProgress = syncProgress;
            return this;
        }
        public Integer getSyncProgress() {
            return this.syncProgress;
        }

    }

    public static class DescribeExpressSyncSharesResponseBodyShares extends TeaModel {
        @NameInMap("Share")
        public java.util.List<DescribeExpressSyncSharesResponseBodySharesShare> share;

        public static DescribeExpressSyncSharesResponseBodyShares build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressSyncSharesResponseBodyShares self = new DescribeExpressSyncSharesResponseBodyShares();
            return TeaModel.build(map, self);
        }

        public DescribeExpressSyncSharesResponseBodyShares setShare(java.util.List<DescribeExpressSyncSharesResponseBodySharesShare> share) {
            this.share = share;
            return this;
        }
        public java.util.List<DescribeExpressSyncSharesResponseBodySharesShare> getShare() {
            return this.share;
        }

    }

}
