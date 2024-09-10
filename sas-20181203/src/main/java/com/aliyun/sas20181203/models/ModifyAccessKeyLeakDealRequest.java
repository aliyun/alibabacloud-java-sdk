// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAccessKeyLeakDealRequest extends TeaModel {
    /**
     * <p>The ID of the AccessKey pair leak.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeAccesskeyLeakList~~">DescribeAccesskeyLeakList</a> operation to query the ID. You must specify at least one of the Id and <strong>IdList</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The IDs of AccessKey pair leaks.</p>
     */
    @NameInMap("IdList")
    public java.util.List<Long> idList;

    /**
     * <p>The remarks that are added.</p>
     * 
     * <strong>example:</strong>
     * <p>disabled.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The method to handle the AccessKey pair leak. Valid values:</p>
     * <ul>
     * <li><strong>manual</strong>: manually handle</li>
     * <li><strong>disable</strong>: disable</li>
     * <li><strong>add-whitelist</strong>: add to the whitelist</li>
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
