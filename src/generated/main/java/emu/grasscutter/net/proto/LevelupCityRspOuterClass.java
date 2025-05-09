// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LevelupCityRsp.proto

package emu.grasscutter.net.proto;

public final class LevelupCityRspOuterClass {
  private LevelupCityRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LevelupCityRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LevelupCityRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CityInfo city_info = 1;</code>
     * @return Whether the cityInfo field is set.
     */
    boolean hasCityInfo();
    /**
     * <code>.CityInfo city_info = 1;</code>
     * @return The cityInfo.
     */
    emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo getCityInfo();
    /**
     * <code>.CityInfo city_info = 1;</code>
     */
    emu.grasscutter.net.proto.CityInfoOuterClass.CityInfoOrBuilder getCityInfoOrBuilder();

    /**
     * <code>uint32 area_id = 11;</code>
     * @return The areaId.
     */
    int getAreaId();

    /**
     * <code>uint32 scene_id = 12;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code LevelupCityRsp}
   */
  public static final class LevelupCityRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LevelupCityRsp)
      LevelupCityRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LevelupCityRsp.newBuilder() to construct.
    private LevelupCityRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LevelupCityRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LevelupCityRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LevelupCityRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.Builder subBuilder = null;
              if (cityInfo_ != null) {
                subBuilder = cityInfo_.toBuilder();
              }
              cityInfo_ = input.readMessage(emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cityInfo_);
                cityInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 88: {

              areaId_ = input.readUInt32();
              break;
            }
            case 96: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LevelupCityRspOuterClass.internal_static_LevelupCityRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LevelupCityRspOuterClass.internal_static_LevelupCityRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp.class, emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp.Builder.class);
    }

    public static final int CITY_INFO_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo cityInfo_;
    /**
     * <code>.CityInfo city_info = 1;</code>
     * @return Whether the cityInfo field is set.
     */
    @java.lang.Override
    public boolean hasCityInfo() {
      return cityInfo_ != null;
    }
    /**
     * <code>.CityInfo city_info = 1;</code>
     * @return The cityInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo getCityInfo() {
      return cityInfo_ == null ? emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.getDefaultInstance() : cityInfo_;
    }
    /**
     * <code>.CityInfo city_info = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CityInfoOuterClass.CityInfoOrBuilder getCityInfoOrBuilder() {
      return getCityInfo();
    }

    public static final int AREA_ID_FIELD_NUMBER = 11;
    private int areaId_;
    /**
     * <code>uint32 area_id = 11;</code>
     * @return The areaId.
     */
    @java.lang.Override
    public int getAreaId() {
      return areaId_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 12;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 12;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (cityInfo_ != null) {
        output.writeMessage(1, getCityInfo());
      }
      if (areaId_ != 0) {
        output.writeUInt32(11, areaId_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(12, sceneId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCityInfo());
      }
      if (areaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, areaId_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, sceneId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp other = (emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp) obj;

      if (hasCityInfo() != other.hasCityInfo()) return false;
      if (hasCityInfo()) {
        if (!getCityInfo()
            .equals(other.getCityInfo())) return false;
      }
      if (getAreaId()
          != other.getAreaId()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCityInfo()) {
        hash = (37 * hash) + CITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getCityInfo().hashCode();
      }
      hash = (37 * hash) + AREA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAreaId();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code LevelupCityRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LevelupCityRsp)
        emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LevelupCityRspOuterClass.internal_static_LevelupCityRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LevelupCityRspOuterClass.internal_static_LevelupCityRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp.class, emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (cityInfoBuilder_ == null) {
          cityInfo_ = null;
        } else {
          cityInfo_ = null;
          cityInfoBuilder_ = null;
        }
        areaId_ = 0;

        sceneId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LevelupCityRspOuterClass.internal_static_LevelupCityRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp build() {
        emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp buildPartial() {
        emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp result = new emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp(this);
        if (cityInfoBuilder_ == null) {
          result.cityInfo_ = cityInfo_;
        } else {
          result.cityInfo_ = cityInfoBuilder_.build();
        }
        result.areaId_ = areaId_;
        result.sceneId_ = sceneId_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp) {
          return mergeFrom((emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp other) {
        if (other == emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp.getDefaultInstance()) return this;
        if (other.hasCityInfo()) {
          mergeCityInfo(other.getCityInfo());
        }
        if (other.getAreaId() != 0) {
          setAreaId(other.getAreaId());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo cityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo, emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.Builder, emu.grasscutter.net.proto.CityInfoOuterClass.CityInfoOrBuilder> cityInfoBuilder_;
      /**
       * <code>.CityInfo city_info = 1;</code>
       * @return Whether the cityInfo field is set.
       */
      public boolean hasCityInfo() {
        return cityInfoBuilder_ != null || cityInfo_ != null;
      }
      /**
       * <code>.CityInfo city_info = 1;</code>
       * @return The cityInfo.
       */
      public emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo getCityInfo() {
        if (cityInfoBuilder_ == null) {
          return cityInfo_ == null ? emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.getDefaultInstance() : cityInfo_;
        } else {
          return cityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.CityInfo city_info = 1;</code>
       */
      public Builder setCityInfo(emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo value) {
        if (cityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          cityInfo_ = value;
          onChanged();
        } else {
          cityInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CityInfo city_info = 1;</code>
       */
      public Builder setCityInfo(
          emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.Builder builderForValue) {
        if (cityInfoBuilder_ == null) {
          cityInfo_ = builderForValue.build();
          onChanged();
        } else {
          cityInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CityInfo city_info = 1;</code>
       */
      public Builder mergeCityInfo(emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo value) {
        if (cityInfoBuilder_ == null) {
          if (cityInfo_ != null) {
            cityInfo_ =
              emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.newBuilder(cityInfo_).mergeFrom(value).buildPartial();
          } else {
            cityInfo_ = value;
          }
          onChanged();
        } else {
          cityInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CityInfo city_info = 1;</code>
       */
      public Builder clearCityInfo() {
        if (cityInfoBuilder_ == null) {
          cityInfo_ = null;
          onChanged();
        } else {
          cityInfo_ = null;
          cityInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CityInfo city_info = 1;</code>
       */
      public emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.Builder getCityInfoBuilder() {
        
        onChanged();
        return getCityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.CityInfo city_info = 1;</code>
       */
      public emu.grasscutter.net.proto.CityInfoOuterClass.CityInfoOrBuilder getCityInfoOrBuilder() {
        if (cityInfoBuilder_ != null) {
          return cityInfoBuilder_.getMessageOrBuilder();
        } else {
          return cityInfo_ == null ?
              emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.getDefaultInstance() : cityInfo_;
        }
      }
      /**
       * <code>.CityInfo city_info = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo, emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.Builder, emu.grasscutter.net.proto.CityInfoOuterClass.CityInfoOrBuilder> 
          getCityInfoFieldBuilder() {
        if (cityInfoBuilder_ == null) {
          cityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo, emu.grasscutter.net.proto.CityInfoOuterClass.CityInfo.Builder, emu.grasscutter.net.proto.CityInfoOuterClass.CityInfoOrBuilder>(
                  getCityInfo(),
                  getParentForChildren(),
                  isClean());
          cityInfo_ = null;
        }
        return cityInfoBuilder_;
      }

      private int areaId_ ;
      /**
       * <code>uint32 area_id = 11;</code>
       * @return The areaId.
       */
      @java.lang.Override
      public int getAreaId() {
        return areaId_;
      }
      /**
       * <code>uint32 area_id = 11;</code>
       * @param value The areaId to set.
       * @return This builder for chaining.
       */
      public Builder setAreaId(int value) {
        
        areaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 area_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaId() {
        
        areaId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 12;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 12;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LevelupCityRsp)
    }

    // @@protoc_insertion_point(class_scope:LevelupCityRsp)
    private static final emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp();
    }

    public static emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LevelupCityRsp>
        PARSER = new com.google.protobuf.AbstractParser<LevelupCityRsp>() {
      @java.lang.Override
      public LevelupCityRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LevelupCityRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LevelupCityRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LevelupCityRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LevelupCityRspOuterClass.LevelupCityRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LevelupCityRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LevelupCityRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024LevelupCityRsp.proto\032\016CityInfo.proto\"b" +
      "\n\016LevelupCityRsp\022\034\n\tcity_info\030\001 \001(\0132\t.Ci" +
      "tyInfo\022\017\n\007area_id\030\013 \001(\r\022\020\n\010scene_id\030\014 \001(" +
      "\r\022\017\n\007retcode\030\016 \001(\005B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CityInfoOuterClass.getDescriptor(),
        });
    internal_static_LevelupCityRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LevelupCityRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LevelupCityRsp_descriptor,
        new java.lang.String[] { "CityInfo", "AreaId", "SceneId", "Retcode", });
    emu.grasscutter.net.proto.CityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
