// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptContinueRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>一队全副武装的执法人员和消防员闯入了一间明显已被遗弃多日、门窗紧闭并用胶带封死的公寓，面对着屋内令人作呕的恶臭和门厅里的混乱场面，他们似乎在寻找某种隐藏的真相或危险源，而一封日期为16号的信件成为了揭开谜团的关键线索，随着便衣探员深入探索，一系列封闭的房间暗示着这里曾发生过不为人知的秘密事件。</p>
     */
    @NameInMap("scriptSummary")
    public String scriptSummary;

    /**
     * <strong>example:</strong>
     * <p>悬疑，都市，惊悚</p>
     */
    @NameInMap("scriptTypeKeyword")
    public String scriptTypeKeyword;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>门厅一片狼藉。朝向天井的窗户开着。公寓门突然被撞开了。\n一名便衣探员、两名穿制服的警察和几位消防员———也身着工作服———进来，四下张望。他们都戴着手套以及盖住口鼻的面罩。在他们身后，门房和他妻子也挤进门厅。他们都捂着鼻子。门房的另一只手里拿着一叠信件和促销广告单。他们身后，跟着一位女邻居。\n便衣探员（对门房和邻居）：请在外面等候。\n他向一名警察示意，警察正忙着把好奇的旁观者请出门外。\n警察（对门房，指着那一叠信件）：最近的一封是哪天的？\n门房（查对信件）：最近的一封似乎是16号的......等一下......\n便衣探员想打开左侧的门，却是徒劳。门用胶带封上了。\n便衣探员（对消防员）：你来试一下好吗？\n消防员摆弄门的时候，便衣探员进了卧室隔壁的餐厅。他迅速打开窗，转身，想经过对开门进左侧的房间。这两扇门也锁着，门缝被贴上了胶带。他右转进入起居室，也打开了窗户</p>
     */
    @NameInMap("userProvidedContent")
    public String userProvidedContent;

    public static RunScriptContinueRequest build(java.util.Map<String, ?> map) throws Exception {
        RunScriptContinueRequest self = new RunScriptContinueRequest();
        return TeaModel.build(map, self);
    }

    public RunScriptContinueRequest setScriptSummary(String scriptSummary) {
        this.scriptSummary = scriptSummary;
        return this;
    }
    public String getScriptSummary() {
        return this.scriptSummary;
    }

    public RunScriptContinueRequest setScriptTypeKeyword(String scriptTypeKeyword) {
        this.scriptTypeKeyword = scriptTypeKeyword;
        return this;
    }
    public String getScriptTypeKeyword() {
        return this.scriptTypeKeyword;
    }

    public RunScriptContinueRequest setUserProvidedContent(String userProvidedContent) {
        this.userProvidedContent = userProvidedContent;
        return this;
    }
    public String getUserProvidedContent() {
        return this.userProvidedContent;
    }

}
