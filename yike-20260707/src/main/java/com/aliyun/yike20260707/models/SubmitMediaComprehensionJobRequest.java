// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitMediaComprehensionJobRequest extends TeaModel {
    /**
     * <p>The input material. JSON string with the following structure:</p>
     * <ul>
     * <li>Medias (Array<Object>, required): The list of media assets. Contains 1 to 10 elements. Each element includes the following fields:<ul>
     * <li>Type (String, required): The media asset type. Valid values: video or image (case-insensitive).</li>
     * <li>Url (String, either Url or MediaId is required): The URL of the media asset. The URL must start with http:// or https:// and cannot exceed 2048 characters in length. Unregistered URLs are automatically registered as media assets.</li>
     * <li>MediaId (String, either Url or MediaId is required): The ID of a registered media asset. If both Url and MediaId are specified, MediaId takes precedence.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Medias&quot;:[{&quot;Type&quot;:&quot;video&quot;,&quot;Url&quot;:&quot;<a href="https://xxx.mp4%22%7D%5D%7D">https://xxx.mp4&quot;}]}</a></p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The analysis parameters. JSON string. The total length cannot exceed 65536 characters, and the total number of fields cannot exceed 20.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProductName&quot;:&quot;Quiet Blender Soymilk Maker&quot;,&quot;BrandName&quot;:&quot;LiangChu&quot;,&quot;SellingPoints&quot;:[&quot;Low-noise blending&quot;,&quot;One-touch self-cleaning&quot;]}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The job type.</p>
     * <ul>
     * <li>VideoBreakdown: viral video breakdown. Requires Medias to contain exactly 1 element with Type=video.</li>
     * <li>ProductRecognition: product image information recognition. Requires all elements in Medias to have Type=image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VideoBreakdown</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The custom parameters. JSON string that is returned as-is in the callback result (for example, newsKey). The system reserved field NotifyAddress specifies the callback URL. The callback is triggered after the job is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaComprehensionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaComprehensionJobRequest self = new SubmitMediaComprehensionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaComprehensionJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitMediaComprehensionJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitMediaComprehensionJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public SubmitMediaComprehensionJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
