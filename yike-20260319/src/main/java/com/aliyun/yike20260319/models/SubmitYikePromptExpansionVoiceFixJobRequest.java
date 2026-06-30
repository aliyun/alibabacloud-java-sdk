// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikePromptExpansionVoiceFixJobRequest extends TeaModel {
    /**
     * <p>The task parameters, a JSON-formatted string. The following fields are included:</p>
     * <ul>
     * <li>model (String, required): The model name. Example: happyhorse-1.0-r2v.</li>
     * <li>input (Object, required): The input data object.<ul>
     * <li>prompt (String, required): The prompt content. Maximum length: 10,000 characters.</li>
     * <li>media (Array(Object), required): The list of media materials used to specify reference images and audio.<ul>
     * <li>type (String, required): The type of the input media asset. Valid values: reference_image and reference_audio.</li>
     * <li>url (String, required): The URL of the input media asset.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>parameters (Object, required): The video generation parameter object.<ul>
     * <li>duration (Integer, required): The video duration in seconds. The value must be a positive integer. Valid values: 5 to 15.</li>
     * <li>ratio (String, required): The aspect ratio of the video. Valid values: 16:9, 9:16, 4:3, 3:4, and 1:1.</li>
     * <li>resolution (String, required): The video resolution. Valid values: 720P and 1080P.</li>
     * <li>specialEdition (Bool, optional): The cost-effective edition parameter. This parameter can be set to true only when the resolution is 1080P.</li>
     * <li>skipPromptEnhancer (Bool, optional): Specifies whether to skip prompt enhancement. Default value: false.</li>
     * <li>skipVoiceResync (Bool, optional): Specifies whether to skip audio repair. Default value: false.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;model\&quot;:\&quot;happyhorse-1.0-r2v\&quot;,\&quot;input\&quot;:{\&quot;prompt\&quot;:\&quot;[Image 1]中身着红色旗袍的女性，镜头先以侧面中景勾勒旗袍修身剪裁与S型曲线，随即切换至低角度仰拍，捕捉她轻抬玉手展开[Image 2]中的折扇的同时，[Image 3]中的流苏耳坠随头部转动轻盈摆动的细节，最后推近至面部特写，定格在她指尖轻点扇骨、眼波流转间的含蓄风情，多视角全方位展现东方韵味。\&quot;,\&quot;media\&quot;:[{\&quot;type\&quot;:\&quot;reference_image\&quot;,\&quot;url\&quot;:\&quot;<a href="https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/mvzfud/hh-v2v-girl.jpg%5C%5C%22%7D,%7B%5C%5C%22type%5C%5C%22:%5C%5C%22reference_image%5C%5C%22,%5C%5C%22url%5C%5C%22:%5C%5C%22https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/fvuihk/hh-v2v2-folding-fan.jpg%5C%5C%22%7D,%7B%5C%5C%22type%5C%5C%22:%5C%5C%22reference_image%5C%5C%22,%5C%5C%22url%5C%5C%22:%5C%5C%22https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/imerii/hh-v2v-earrings.jpg%5C%5C%22%7D%5D%7D,%5C%5C%22parameters%5C%5C%22:%7B%5C%5C%22resolution%5C%5C%22:%5C%5C%22720P%5C%5C%22,%5C%5C%22ratio%5C%5C%22:%5C%5C%2216:9%5C%5C%22,%5C%5C%22duration%5C%5C%22:5,%5C%5C%22specialEdition%5C%5C%22:false,%5C%5C%22skipPromptEnhancer%5C%5C%22:false,%5C%5C%22skipVoiceResync%5C%5C%22:false%7D%7D">https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/mvzfud/hh-v2v-girl.jpg\\&quot;},{\\&quot;type\\&quot;:\\&quot;reference_image\\&quot;,\\&quot;url\\&quot;:\\&quot;https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/fvuihk/hh-v2v2-folding-fan.jpg\\&quot;},{\\&quot;type\\&quot;:\\&quot;reference_image\\&quot;,\\&quot;url\\&quot;:\\&quot;https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/imerii/hh-v2v-earrings.jpg\\&quot;}]},\\&quot;parameters\\&quot;:{\\&quot;resolution\\&quot;:\\&quot;720P\\&quot;,\\&quot;ratio\\&quot;:\\&quot;16:9\\&quot;,\\&quot;duration\\&quot;:5,\\&quot;specialEdition\\&quot;:false,\\&quot;skipPromptEnhancer\\&quot;:false,\\&quot;skipVoiceResync\\&quot;:false}}</a></p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The custom user parameter, a JSON string. This parameter is returned as-is in the callback result. Example: newsKey.</p>
     * <p>The system reserved field NotifyAddress specifies the callback URL. After the task is completed, a callback is sent. Example: {&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;newsKey\&quot;:\&quot;NEWS_20260420_001\&quot;,\&quot;key1\&quot;:\&quot;value1\&quot;, \&quot;NotifyAddress\&quot;:\&quot;<a href="https://cms.example.com/callback/video-task%5C%5C%22%7D">https://cms.example.com/callback/video-task\\&quot;}</a>
     * 系统保留字段 NotifyAddress，回调地址 URL，任务完成后回调 {&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitYikePromptExpansionVoiceFixJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikePromptExpansionVoiceFixJobRequest self = new SubmitYikePromptExpansionVoiceFixJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitYikePromptExpansionVoiceFixJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitYikePromptExpansionVoiceFixJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
