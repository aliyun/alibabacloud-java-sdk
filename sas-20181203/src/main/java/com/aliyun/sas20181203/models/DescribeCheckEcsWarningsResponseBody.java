// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckEcsWarningsResponseBody extends TeaModel {
    // Indicates whether you use the free trial of Security Center. Valid values:
    // 
    // *   **0**: no
    // *   **1**: yes
    @NameInMap("CanTry")
    public String canTry;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The edition of Security Center that you use. Valid values:
    // 
    // *   **1**: Basic edition
    // *   **2** or **3**: Enterprise edition
    // *   **5**: Advanced edition
    // *   **6**: Anti-virus edition
    // 
    // >  Both the value 2 and the value 3 indicate the Enterprise edition.
    @NameInMap("SasVersion")
    public String sasVersion;

    // The number of weak passwords that can cause high risks to your assets.
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
