// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to enhance the detection of the anomalous activity. Enhancing detection improves accuracy and increases the alert rate for anomalous activities.</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong>: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Backed")
    public Boolean backed;

    /**
     * <p>The reason for handling the anomalous activity.</p>
     * 
     * <strong>example:</strong>
     * <p>Confirmed as violation</p>
     */
    @NameInMap("DealReason")
    public String dealReason;

    /**
     * <p>The unique ID of the anomalous activity.</p>
     * <blockquote>
     * <p>To handle an anomalous activity, you must provide its unique ID. You can obtain this ID by calling the <strong>DescribeEvents</strong> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response. The default value is <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operation to perform on the anomalous activity.</p>
     * <ul>
     * <li><p><strong>1</strong>: Mark as false positive.</p>
     * </li>
     * <li><p><strong>2</strong>: Confirm and handle the anomalous activity.</p>
     * </li>
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
