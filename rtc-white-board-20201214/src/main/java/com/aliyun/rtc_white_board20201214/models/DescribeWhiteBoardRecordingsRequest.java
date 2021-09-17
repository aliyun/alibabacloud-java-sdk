// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class DescribeWhiteBoardRecordingsRequest extends TeaModel {
    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    // 文档唯一标识符
    @NameInMap("DocKey")
    public String docKey;

    // 第几页，默认查询第1页
    @NameInMap("PageNum")
    public Long pageNum;

    // 每页显示个数，默认为10
    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeWhiteBoardRecordingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteBoardRecordingsRequest self = new DescribeWhiteBoardRecordingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteBoardRecordingsRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public DescribeWhiteBoardRecordingsRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public DescribeWhiteBoardRecordingsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeWhiteBoardRecordingsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
