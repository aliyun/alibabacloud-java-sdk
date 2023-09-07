// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockStatusResponseBody extends TeaModel {
    /**
     * <p>The total quota that you purchase for web tamper proofing.</p>
     */
    @NameInMap("AuthCount")
    public Integer authCount;

    /**
     * <p>The associated tamper proofing quota.</p>
     */
    @NameInMap("BindCount")
    public Integer bindCount;

    /**
     * <p>The number of blocked processes.</p>
     */
    @NameInMap("BlockCount")
    public Integer blockCount;

    /**
     * <p>The number of protected directories.</p>
     */
    @NameInMap("DirCount")
    public Integer dirCount;

    /**
     * <p>The timestamp generated when the quota for tamper proofing expires. Unit: millisecond.</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of processes in the whitelist.</p>
     */
    @NameInMap("WhiteCount")
    public Integer whiteCount;

    public static DescribeWebLockStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockStatusResponseBody self = new DescribeWebLockStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockStatusResponseBody setAuthCount(Integer authCount) {
        this.authCount = authCount;
        return this;
    }
    public Integer getAuthCount() {
        return this.authCount;
    }

    public DescribeWebLockStatusResponseBody setBindCount(Integer bindCount) {
        this.bindCount = bindCount;
        return this;
    }
    public Integer getBindCount() {
        return this.bindCount;
    }

    public DescribeWebLockStatusResponseBody setBlockCount(Integer blockCount) {
        this.blockCount = blockCount;
        return this;
    }
    public Integer getBlockCount() {
        return this.blockCount;
    }

    public DescribeWebLockStatusResponseBody setDirCount(Integer dirCount) {
        this.dirCount = dirCount;
        return this;
    }
    public Integer getDirCount() {
        return this.dirCount;
    }

    public DescribeWebLockStatusResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public DescribeWebLockStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockStatusResponseBody setWhiteCount(Integer whiteCount) {
        this.whiteCount = whiteCount;
        return this;
    }
    public Integer getWhiteCount() {
        return this.whiteCount;
    }

}
