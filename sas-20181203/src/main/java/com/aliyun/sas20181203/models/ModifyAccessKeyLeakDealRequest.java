// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAccessKeyLeakDealRequest extends TeaModel {
    /**
     * <p>The ID of the AccessKey pair leak.</p>
     * <br>
     * <p>> You can call the [DescribeAccesskeyLeakList](~~DescribeAccesskeyLeakList~~) operation to query the ID. You must specify at least one of the Id and **IdList** parameters.</p>
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
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The method to handle the AccessKey pair leak. Valid values:</p>
     * <br>
     * <p>*   **manual**: manually handle</p>
     * <p>*   **disable**: disable</p>
     * <p>*   **add-whitelist**: add to the whitelist</p>
     * <br>
     * <p>This parameter is required.</p>
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
