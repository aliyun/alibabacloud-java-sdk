// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SanityCheckResultItem extends TeaModel {
    /**
     * <p>The check number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CheckNumber")
    public Integer checkNumber;

    /**
     * <p>The check end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-11-30T16:47:30.378817+08:00</p>
     */
    @NameInMap("FinishedAt")
    public String finishedAt;

    /**
     * <p>The check result details.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The check phase.</p>
     * 
     * <strong>example:</strong>
     * <p>CheckInit</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The check start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-11-30T16:47:30.343005+08:00</p>
     */
    @NameInMap("StartedAt")
    public String startedAt;

    /**
     * <p>The check status.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    public static SanityCheckResultItem build(java.util.Map<String, ?> map) throws Exception {
        SanityCheckResultItem self = new SanityCheckResultItem();
        return TeaModel.build(map, self);
    }

    public SanityCheckResultItem setCheckNumber(Integer checkNumber) {
        this.checkNumber = checkNumber;
        return this;
    }
    public Integer getCheckNumber() {
        return this.checkNumber;
    }

    public SanityCheckResultItem setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public SanityCheckResultItem setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SanityCheckResultItem setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public SanityCheckResultItem setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public SanityCheckResultItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
