// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckTrialFixCountResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the vulnerability can be fixed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CanFix")
    public Boolean canFix;

    /**
     * <p>The quota usage required for the current fix operation.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ExpendCount")
    public Integer expendCount;

    /**
     * <p>The quota that remains after the current fix operation is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RemainCount")
    public Integer remainCount;

    /**
     * <p>The number of the vulnerabilities that are fixed.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RepairedCount")
    public Integer repairedCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether Security Center is in free trial. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isTrial")
    public Boolean isTrial;

    public static CheckTrialFixCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckTrialFixCountResponseBody self = new CheckTrialFixCountResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckTrialFixCountResponseBody setCanFix(Boolean canFix) {
        this.canFix = canFix;
        return this;
    }
    public Boolean getCanFix() {
        return this.canFix;
    }

    public CheckTrialFixCountResponseBody setExpendCount(Integer expendCount) {
        this.expendCount = expendCount;
        return this;
    }
    public Integer getExpendCount() {
        return this.expendCount;
    }

    public CheckTrialFixCountResponseBody setRemainCount(Integer remainCount) {
        this.remainCount = remainCount;
        return this;
    }
    public Integer getRemainCount() {
        return this.remainCount;
    }

    public CheckTrialFixCountResponseBody setRepairedCount(Integer repairedCount) {
        this.repairedCount = repairedCount;
        return this;
    }
    public Integer getRepairedCount() {
        return this.repairedCount;
    }

    public CheckTrialFixCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckTrialFixCountResponseBody setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
        return this;
    }
    public Boolean getIsTrial() {
        return this.isTrial;
    }

}
