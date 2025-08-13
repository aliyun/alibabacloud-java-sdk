// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreListRequest extends TeaModel {
    /**
     * <p>Primary key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>300126</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Language type of the returned message. Values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeScoreListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreListRequest self = new DescribeScoreListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScoreListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeScoreListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
