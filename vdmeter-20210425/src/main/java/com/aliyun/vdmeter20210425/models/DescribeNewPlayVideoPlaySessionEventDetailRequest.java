// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeNewPlayVideoPlaySessionEventDetailRequest extends TeaModel {
    @NameInMap("BizDate")
    public Long bizDate;

    @NameInMap("InputStatus")
    public String inputStatus;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("VPS")
    public String VPS;

    public static DescribeNewPlayVideoPlaySessionEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewPlayVideoPlaySessionEventDetailRequest self = new DescribeNewPlayVideoPlaySessionEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNewPlayVideoPlaySessionEventDetailRequest setBizDate(Long bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public Long getBizDate() {
        return this.bizDate;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailRequest setInputStatus(String inputStatus) {
        this.inputStatus = inputStatus;
        return this;
    }
    public String getInputStatus() {
        return this.inputStatus;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailRequest setVPS(String VPS) {
        this.VPS = VPS;
        return this;
    }
    public String getVPS() {
        return this.VPS;
    }

}
