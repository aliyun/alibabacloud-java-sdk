// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DemoCategory extends TeaModel {
    // 目录码
    @NameInMap("CategoryCode")
    public String categoryCode;

    // 目录名
    @NameInMap("CategoryName")
    public String categoryName;

    // 序号
    @NameInMap("Order")
    public Long order;

    // 目录列表
    @NameInMap("SubCategories")
    public java.util.List<DemoCategory> subCategories;

    public static DemoCategory build(java.util.Map<String, ?> map) throws Exception {
        DemoCategory self = new DemoCategory();
        return TeaModel.build(map, self);
    }

    public DemoCategory setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public DemoCategory setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public DemoCategory setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public DemoCategory setSubCategories(java.util.List<DemoCategory> subCategories) {
        this.subCategories = subCategories;
        return this;
    }
    public java.util.List<DemoCategory> getSubCategories() {
        return this.subCategories;
    }

}
