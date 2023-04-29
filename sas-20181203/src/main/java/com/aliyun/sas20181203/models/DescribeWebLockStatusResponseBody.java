// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockStatusResponseBody extends TeaModel {
    @NameInMap("AuthCount")
    public Integer authCount;

    @NameInMap("BindCount")
    public Integer bindCount;

    @NameInMap("BlockCount")
    public Integer blockCount;

    @NameInMap("DirCount")
    public Integer dirCount;

    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("RequestId")
    public String requestId;

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
