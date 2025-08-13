// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceCodeNameRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>FNAENIC</p>
     */
    @NameInMap("Tab")
    public String tab;

    public static DescribeServiceCodeNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceCodeNameRequest self = new DescribeServiceCodeNameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceCodeNameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeServiceCodeNameRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

}
