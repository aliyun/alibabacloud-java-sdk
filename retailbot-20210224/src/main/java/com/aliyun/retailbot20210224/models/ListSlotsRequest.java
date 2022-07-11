// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSlotsRequest extends TeaModel {
    // 槽位所属分类id
    @NameInMap("CategoryId")
    public Integer categoryId;

    // 槽位名称关键字
    @NameInMap("Keyword")
    public String keyword;

    // 当前页码
    @NameInMap("PageNo")
    public Integer pageNo;

    // 每页显示数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 机器人id（如果为空，则是操作ISV维度的数据）
    @NameInMap("RobotCode")
    public String robotCode;

    // 槽位来源，0表示官方槽位，1表示自定义槽位
    @NameInMap("Source")
    public Integer source;

    // 槽位类型， 0表示枚举型，1表示区间型，2表示函数型
    @NameInMap("Type")
    public Integer type;

    public static ListSlotsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlotsRequest self = new ListSlotsRequest();
        return TeaModel.build(map, self);
    }

    public ListSlotsRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public ListSlotsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListSlotsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListSlotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSlotsRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public ListSlotsRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public ListSlotsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
