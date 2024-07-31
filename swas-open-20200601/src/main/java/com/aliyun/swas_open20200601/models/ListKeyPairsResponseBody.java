// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListKeyPairsResponseBody extends TeaModel {
    /**
     * <p>Details about the queried AccessKey pairs.</p>
     */
    @NameInMap("KeyPairs")
    public java.util.List<ListKeyPairsResponseBodyKeyPairs> keyPairs;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListKeyPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKeyPairsResponseBody self = new ListKeyPairsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKeyPairsResponseBody setKeyPairs(java.util.List<ListKeyPairsResponseBodyKeyPairs> keyPairs) {
        this.keyPairs = keyPairs;
        return this;
    }
    public java.util.List<ListKeyPairsResponseBodyKeyPairs> getKeyPairs() {
        return this.keyPairs;
    }

    public ListKeyPairsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKeyPairsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKeyPairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKeyPairsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListKeyPairsResponseBodyKeyPairs extends TeaModel {
        /**
         * <p>The time when the AccessKey pair was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-06T02:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The IDs of simple application servers. A maximum of 50 IDs of simple application servers can be returned.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The name of the AccessKey pair. The name must be 2 to 64 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testKeyPairName</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The content of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCbO5Govwhb0iHzoMYKkIQxjlHyHH8nxFsW6KF5saxgYhOwdeIpWngpi+/NDWQKvuOnXFFDh/o3eJJkh3rqP+RlMggt4HLQWOd9TS0f4/cgbAzud1caW9PnankCr****</p>
         */
        @NameInMap("PublicKey")
        public String publicKey;

        public static ListKeyPairsResponseBodyKeyPairs build(java.util.Map<String, ?> map) throws Exception {
            ListKeyPairsResponseBodyKeyPairs self = new ListKeyPairsResponseBodyKeyPairs();
            return TeaModel.build(map, self);
        }

        public ListKeyPairsResponseBodyKeyPairs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListKeyPairsResponseBodyKeyPairs setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public ListKeyPairsResponseBodyKeyPairs setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public ListKeyPairsResponseBodyKeyPairs setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

    }

}
