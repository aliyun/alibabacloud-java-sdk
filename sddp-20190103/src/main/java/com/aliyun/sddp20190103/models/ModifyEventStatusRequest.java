// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to enhance the detection of anomalous events. If you enhance the detection of anomalous events, the detection accuracy and the rate of triggering alerts for anomalous events are improved. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Backed")
    public Boolean backed;

    /**
     * <p>The reason why the anomalous event is handled.</p>
     */
    @NameInMap("DealReason")
    public String dealReason;

    /**
     * <p>The ID of the anomalous event.</p>
     * <br>
     * <p>> You can call the **DescribeEvents** operation to query the ID of the anomalous event.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The method to handle the anomalous event. Valid values:</p>
     * <br>
     * <p>*   **1**: marks the anomalous event as a false positive.</p>
     * <p>*   **2**: confirms and handles the anomalous event.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ModifyEventStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventStatusRequest self = new ModifyEventStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEventStatusRequest setBacked(Boolean backed) {
        this.backed = backed;
        return this;
    }
    public Boolean getBacked() {
        return this.backed;
    }

    public ModifyEventStatusRequest setDealReason(String dealReason) {
        this.dealReason = dealReason;
        return this;
    }
    public String getDealReason() {
        return this.dealReason;
    }

    public ModifyEventStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyEventStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyEventStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
