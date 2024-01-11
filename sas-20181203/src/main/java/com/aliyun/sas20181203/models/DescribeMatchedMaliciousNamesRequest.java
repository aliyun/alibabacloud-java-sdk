// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMatchedMaliciousNamesRequest extends TeaModel {
    /**
     * <p>设置请求和接收消息的语言类型，默认为**zh**。取值：</p>
     * <br>
     * <p>- **zh**：中文</p>
     * <p>- **en**：英文</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>要查询的镜像恶意样本的危险程度。可输入多个值，多个值之间使用英文逗号（,）分隔。取值：</p>
     * <p>- **serious**：紧急</p>
     * <p>- **suspicious**：可疑</p>
     * <p>- **remind**：提醒</p>
     */
    @NameInMap("Levels")
    public String levels;

    public static DescribeMatchedMaliciousNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMatchedMaliciousNamesRequest self = new DescribeMatchedMaliciousNamesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMatchedMaliciousNamesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeMatchedMaliciousNamesRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

}
