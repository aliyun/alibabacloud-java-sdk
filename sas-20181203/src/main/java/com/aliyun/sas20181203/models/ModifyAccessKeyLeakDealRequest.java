// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAccessKeyLeakDealRequest extends TeaModel {
    /**
     * <p>The ID of the AccessKey pair leak record.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeAccesskeyLeakList~~">DescribeAccesskeyLeakList</a> operation to obtain this parameter. This parameter and the <strong>IdList</strong> parameter cannot both be empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The IDs of the AccessKey pair leak records.</p>
     */
    @NameInMap("IdList")
    public java.util.List<Long> idList;

    /**
     * <p>The remarks for handling the AccessKey pair leak record.</p>
     * 
     * <strong>example:</strong>
     * <p>disabled.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The method to handle the AccessKey pair leak information. Valid values:</p>
     * <ul>
     * <li><strong>manual</strong>: Manual handling.</li>
     * <li><strong>disable</strong>: Disable.</li>
     * <li><strong>add-whitelist</strong>: Add to whitelist.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifyAccessKeyLeakDealRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessKeyLeakDealRequest self = new ModifyAccessKeyLeakDealRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccessKeyLeakDealRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyAccessKeyLeakDealRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    public ModifyAccessKeyLeakDealRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyAccessKeyLeakDealRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
