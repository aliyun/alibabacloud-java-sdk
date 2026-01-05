// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class SlotStatus extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Detail")
    public SlotStatusDetail detail;

    /**
     * <strong>example:</strong>
     * <p>Init Succeed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Phase")
    public String phase;

    public static SlotStatus build(java.util.Map<String, ?> map) throws Exception {
        SlotStatus self = new SlotStatus();
        return TeaModel.build(map, self);
    }

    public SlotStatus setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SlotStatus setDetail(SlotStatusDetail detail) {
        this.detail = detail;
        return this;
    }
    public SlotStatusDetail getDetail() {
        return this.detail;
    }

    public SlotStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SlotStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
