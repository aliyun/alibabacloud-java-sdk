// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckEcsWarningsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether you use the free trial of Security Center. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("CanTry")
    public String canTry;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The edition of Security Center that you use. Valid values:</p>
     * <br>
     * <p>*   **1**: Basic edition</p>
     * <p>*   **2** or **3**: Enterprise edition</p>
     * <p>*   **5**: Advanced edition</p>
     * <p>*   **6**: Anti-virus edition</p>
     * <br>
     * <p>>  Both the value 2 and the value 3 indicate the Enterprise edition.</p>
     */
    @NameInMap("SasVersion")
    public String sasVersion;

    /**
     * <p>The number of weak passwords that can cause high risks to your assets.</p>
     */
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
