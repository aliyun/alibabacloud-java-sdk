// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckEcsWarningsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the current Security Center edition is a trial version. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not a trial version</li>
     * <li><strong>1</strong>: a trial version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CanTry")
    public String canTry;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E5BFDCF-B9DD-430D-9DA4-151BCB581C9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The edition of Security Center that you purchased. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition</li>
     * <li><strong>2</strong> or <strong>3</strong>: Enterprise Edition  </li>
     * <li><strong>5</strong>: Premium Edition  </li>
     * <li><strong>6</strong>: Anti-virus Edition</li>
     * </ul>
     * <blockquote>
     * <p>Both 2 and 3 correspond to Enterprise Edition. There is no difference between the two values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SasVersion")
    public String sasVersion;

    /**
     * <p>The number of high-risk weak password risks detected in your assets.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
