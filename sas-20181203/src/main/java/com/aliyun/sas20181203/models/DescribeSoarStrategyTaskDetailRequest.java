// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTaskDetailRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The ID of the policy task.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10585</p>
     */
    @NameInMap("StrategyTaskId")
    public Long strategyTaskId;

    public static DescribeSoarStrategyTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyTaskDetailRequest self = new DescribeSoarStrategyTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyTaskDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSoarStrategyTaskDetailRequest setStrategyTaskId(Long strategyTaskId) {
        this.strategyTaskId = strategyTaskId;
        return this;
    }
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

}
