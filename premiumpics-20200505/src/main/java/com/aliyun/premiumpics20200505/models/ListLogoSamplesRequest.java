// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListLogoSamplesRequest extends TeaModel {
    @NameInMap("GoodsId")
    public String goodsId;

    @NameInMap("Page")
    public Integer page;

    /**
     * <p>UserId</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListLogoSamplesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogoSamplesRequest self = new ListLogoSamplesRequest();
        return TeaModel.build(map, self);
    }

    public ListLogoSamplesRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public ListLogoSamplesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListLogoSamplesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
