// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckEcsWarningsResponseBody extends TeaModel {
    @NameInMap("CanTry")
    public String canTry;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SasVersion")
    public String sasVersion;

    @NameInMap("WeakPasswordCount")
    public String weakPasswordCount;

    public static DescribeCheckEcsWarningsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckEcsWarningsResponseBody self = new DescribeCheckEcsWarningsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckEcsWarningsResponseBody setCanTry(String canTry) {
        this.canTry = canTry;
        return this;
    }
    public String getCanTry() {
        return this.canTry;
    }

    public DescribeCheckEcsWarningsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCheckEcsWarningsResponseBody setSasVersion(String sasVersion) {
        this.sasVersion = sasVersion;
        return this;
    }
    public String getSasVersion() {
        return this.sasVersion;
    }

    public DescribeCheckEcsWarningsResponseBody setWeakPasswordCount(String weakPasswordCount) {
        this.weakPasswordCount = weakPasswordCount;
        return this;
    }
    public String getWeakPasswordCount() {
        return this.weakPasswordCount;
    }

}
