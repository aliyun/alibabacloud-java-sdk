// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitMediaComprehensionJobRequest extends TeaModel {
    /**
     * <p>The input material. It is a JSON string with the following structure:</p>
     * <ul>
     * <li>Medias (Array<Object>, required): The list of media assets. It contains 1 to 10 elements. Each element includes the following fields:<ul>
     * <li>Type (String, required): The type of the media asset. Valid values: video and image. The value is not case-sensitive.</li>
     * <li>Url (String, mutually exclusive with MediaId): The URL of the media asset. It must start with http:// or https:// and be up to 2,048 characters in length. Unregistered URLs are automatically registered as media assets.</li>
     * <li>MediaId (String, mutually exclusive with Url): The ID of the registered media asset. If both Url and MediaId are specified, MediaId takes precedence.</li>
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
     * <p>The analysis parameters. It is a JSON string with a maximum length of 65,536 characters and a maximum of 20 fields.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProductName&quot;:&quot;Quiet Blender Soymilk Maker&quot;,&quot;BrandName&quot;:&quot;LiangChu&quot;,&quot;SellingPoints&quot;:[&quot;Low-noise blending&quot;,&quot;One-touch self-cleaning&quot;]}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The job type. Valid values:</p>
     * <ul>
     * <li>VideoBreakdown: viral video breakdown. The Medias array must contain exactly one element with Type set to video.</li>
     * <li>ProductRecognition: product image information recognition. All elements in the Medias array must have Type set to image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VideoBreakdown</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The custom parameters. It is a JSON string that is returned as-is in the callback result, such as newsKey. NotifyAddress is a system-reserved field for the callback URL. A callback is triggered to this URL after the job is completed.</p>
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
