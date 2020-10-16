// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ReportDeviceCapacityRequest extends TeaModel {
    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("AudioFormat")
    public String audioFormat;

    @NameInMap("PresetNum")
    public String presetNum;

    @NameInMap("PTZCapacity")
    public String PTZCapacity;

    @NameInMap("DeviceSn")
    @Validation(required = true)
    public String deviceSn;

    @NameInMap("StreamCapacities")
    @Validation(required = true)
    public java.util.List<ReportDeviceCapacityRequestStreamCapacities> streamCapacities;

    @NameInMap("DeviceTimeStamp")
    @Validation(required = true)
    public String deviceTimeStamp;

    public static ReportDeviceCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportDeviceCapacityRequest self = new ReportDeviceCapacityRequest();
        return TeaModel.build(map, self);
    }

    public ReportDeviceCapacityRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public ReportDeviceCapacityRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public ReportDeviceCapacityRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public ReportDeviceCapacityRequest setPresetNum(String presetNum) {
        this.presetNum = presetNum;
        return this;
    }
    public String getPresetNum() {
        return this.presetNum;
    }

    public ReportDeviceCapacityRequest setPTZCapacity(String PTZCapacity) {
        this.PTZCapacity = PTZCapacity;
        return this;
    }
    public String getPTZCapacity() {
        return this.PTZCapacity;
    }

    public ReportDeviceCapacityRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public ReportDeviceCapacityRequest setStreamCapacities(java.util.List<ReportDeviceCapacityRequestStreamCapacities> streamCapacities) {
        this.streamCapacities = streamCapacities;
        return this;
    }
    public java.util.List<ReportDeviceCapacityRequestStreamCapacities> getStreamCapacities() {
        return this.streamCapacities;
    }

    public ReportDeviceCapacityRequest setDeviceTimeStamp(String deviceTimeStamp) {
        this.deviceTimeStamp = deviceTimeStamp;
        return this;
    }
    public String getDeviceTimeStamp() {
        return this.deviceTimeStamp;
    }

    public static class ReportDeviceCapacityRequestStreamCapacities extends TeaModel {
        @NameInMap("EncodeFormat")
        @Validation(required = true)
        public String encodeFormat;

        @NameInMap("Resolution")
        @Validation(required = true)
        public String resolution;

        @NameInMap("MaxFrameRate")
        @Validation(required = true)
        public String maxFrameRate;

        @NameInMap("MaxStream")
        @Validation(required = true)
        public String maxStream;

        @NameInMap("BitrateRange")
        @Validation(required = true)
        public String bitrateRange;

        @NameInMap("GovLengthRange")
        @Validation(required = true)
        public String govLengthRange;

        public static ReportDeviceCapacityRequestStreamCapacities build(java.util.Map<String, ?> map) throws Exception {
            ReportDeviceCapacityRequestStreamCapacities self = new ReportDeviceCapacityRequestStreamCapacities();
            return TeaModel.build(map, self);
        }

        public ReportDeviceCapacityRequestStreamCapacities setEncodeFormat(String encodeFormat) {
            this.encodeFormat = encodeFormat;
            return this;
        }
        public String getEncodeFormat() {
            return this.encodeFormat;
        }

        public ReportDeviceCapacityRequestStreamCapacities setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ReportDeviceCapacityRequestStreamCapacities setMaxFrameRate(String maxFrameRate) {
            this.maxFrameRate = maxFrameRate;
            return this;
        }
        public String getMaxFrameRate() {
            return this.maxFrameRate;
        }

        public ReportDeviceCapacityRequestStreamCapacities setMaxStream(String maxStream) {
            this.maxStream = maxStream;
            return this;
        }
        public String getMaxStream() {
            return this.maxStream;
        }

        public ReportDeviceCapacityRequestStreamCapacities setBitrateRange(String bitrateRange) {
            this.bitrateRange = bitrateRange;
            return this;
        }
        public String getBitrateRange() {
            return this.bitrateRange;
        }

        public ReportDeviceCapacityRequestStreamCapacities setGovLengthRange(String govLengthRange) {
            this.govLengthRange = govLengthRange;
            return this;
        }
        public String getGovLengthRange() {
            return this.govLengthRange;
        }

    }

}
