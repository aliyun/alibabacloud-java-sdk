// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to enhance the detection of anomalous events. If you enhance the detection of anomalous events, the detection accuracy and the rate of triggering alerts for anomalous events are improved. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Backed")
    public Boolean backed;

    /**
     * <p>The reason why the anomalous event is handled.</p>
     * 
     * <strong>example:</strong>
     * <p>Anomaly confirmed</p>
     */
    @NameInMap("DealReason")
    public String dealReason;

    /**
     * <p>The ID of the anomalous event.</p>
     * <blockquote>
     * <p>You can call the <strong>DescribeEvents</strong> operation to query the ID of the anomalous event.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The method to handle the anomalous event. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: marks the anomalous event as a false positive.</li>
     * <li><strong>2</strong>: confirms and handles the anomalous event.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
